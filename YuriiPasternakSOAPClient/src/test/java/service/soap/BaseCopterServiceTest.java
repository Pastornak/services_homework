package service.soap;

import com.epam.lab.service.CopterRemoteControllerImpl;
import com.epam.lab.service.CopterRemoteControllerImplService;
import com.epam.lab.service.IllegalPositionException;
import com.epam.lab.service.Position;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.function.BooleanSupplier;

public class BaseCopterServiceTest {
    protected CopterRemoteControllerImpl service;
    protected static int DEFAULT_RADIUS;
    protected static int DEFAULT_STEP;

    @BeforeMethod
    public void setUpService(){
        CopterRemoteControllerImplService serviceService = new CopterRemoteControllerImplService();
        service = serviceService.getCopterRemoteControllerImplPort();
        DEFAULT_RADIUS = service.getDefaultRadius();
        DEFAULT_STEP = service.getDefaultStep();
    }

    @AfterMethod
    public void resetService(){
        resetPosition();
    }

    public boolean resetPosition(){
        return executeMove(() -> service.reset());
    }

    public Position getPosition(){
        return service.getPosition();
    }

    public boolean moveForward(){
        return executeMove(() -> service.moveForward());
    }

    public boolean moveBackward(){
        return executeMove(() -> service.moveBackward());
    }

    public boolean moveRight(){
        return executeMove(() -> service.moveRight());
    }

    public boolean moveLeft(){
        return executeMove(() -> service.moveLeft());
    }

    public boolean moveUp(){
        return executeMove(() -> service.moveUp());
    }

    public boolean moveDown(){
        return executeMove(() -> service.moveDown());
    }

    protected boolean executeMove(MoveExecutor executor){
        try{
            executor.execute();
            return true;
        } catch (IllegalPositionException e){
            return false;
        }
    }

    protected Position moveToTheExtentInDirection(BooleanSupplier function) {
        int CHECK_FOR_INFINITE_LOOP = 500;
        while (function.getAsBoolean() && CHECK_FOR_INFINITE_LOOP > 0) {
            CHECK_FOR_INFINITE_LOOP--;
        }
        return getPosition();
    }

    protected boolean isEqual(Position position1, Position position2){
        return position1.getX() == position2.getX() && position1.getY() == position2.getY() && position1.getZ() == position2.getZ();
    }

    protected int magnitude(Position position){
        return (int) Math.ceil(Math.sqrt(Math.pow(position.getX(), 2) + Math.pow(position.getY(), 2) + Math.pow(position.getZ(), 2)));
    }

    protected String show(Position position){
        return "[" + position.getX() + ", " + position.getY() + ", " + position.getZ() + "]";
    }
}
