package service.soap;

import com.epam.lab.service.Position;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CopterServiceTest extends BaseCopterServiceTest {

    @Test
    public void testStartPosition(){
        Position expectedPosition = new Position();
        expectedPosition.setX(0);
        expectedPosition.setY(0);
        expectedPosition.setZ(0);
        Position actualPosition = getPosition();
        Assert.assertTrue(isEqual(expectedPosition, actualPosition), "Start position is not at [0, 0, 0]");
    }

    @Test
    public void testNoNegativeAltitude(){
        // if starting position is not at [0, 0, 0]
        Position position = moveToTheExtentInDirection(this::moveDown);
        Assert.assertTrue(position.getZ() < DEFAULT_STEP
                && position.getZ() >= 0, "Z position is not correct");
    }

    @Test
    public void testStepPositive() {
        Position startPosition = getPosition();
        moveForward();
        Assert.assertEquals(getPosition().getY(), startPosition.getY() + DEFAULT_STEP, "Moved forward not for " + DEFAULT_STEP);
        moveRight();
        Assert.assertEquals(getPosition().getX(), startPosition.getX() + DEFAULT_STEP, "Moved right not for " + DEFAULT_STEP);
        moveUp();
        Assert.assertEquals(getPosition().getZ(), startPosition.getZ() + DEFAULT_STEP, "Moved up not for " + DEFAULT_STEP);
    }

    @Test
    public void testStepNegative() {
        Position startPosition = getPosition();
        moveBackward();
        Assert.assertEquals(getPosition().getY(), startPosition.getY() - DEFAULT_STEP, "Moved backward not for " + DEFAULT_STEP);
        moveLeft();
        Assert.assertEquals(getPosition().getX(), startPosition.getX() - DEFAULT_STEP, "Moved left not for " + DEFAULT_STEP);
        if (startPosition.getZ() <= DEFAULT_STEP) {
            if (!moveDown()) {
                Assert.assertTrue(service.getPosition().getZ() >= 0 && service.getPosition().getZ() <= DEFAULT_STEP, "Moving down is not correct");
            }
        } else {
            moveDown();
            Assert.assertEquals(getPosition().getY(), startPosition.getZ() - DEFAULT_STEP, "Moved down not for " + DEFAULT_STEP);
        }
    }

    @Test
    public void testStartPositionLengthLessThanRadius(){
        Position startPosition = getPosition();
        Assert.assertTrue(magnitude(startPosition) <= DEFAULT_RADIUS, "Start position exceeded radius");
    }

    @Test
    public void testMovingForwardDontExceedRadius() {
        if(magnitude(service.getPosition()) > DEFAULT_RADIUS){
            Assert.fail("Start position exceeded radius");
        }
        Assert.assertTrue(magnitude(moveToTheExtentInDirection(this::moveForward)) <= DEFAULT_RADIUS, "Position distance exceeded radius");
    }

    @Test
    public void testMovingBackwardDontExceedRadius(){
        if(magnitude(service.getPosition()) > DEFAULT_RADIUS){
            Assert.fail("Start position exceeded radius");
        }
        Assert.assertTrue(magnitude(moveToTheExtentInDirection(this::moveBackward)) <= DEFAULT_RADIUS, "Position distance exceeded radius");
    }

    @Test
    public void testMovingRightDontExceedRadius(){
        if(magnitude(service.getPosition()) > DEFAULT_RADIUS){
            Assert.fail("Start position exceeded radius");
        }
        Assert.assertTrue(magnitude(moveToTheExtentInDirection(this::moveRight)) <= DEFAULT_RADIUS, "Position distance exceeded radius");
    }

    @Test
    public void testMovingLeftDontExceedRadius(){
        if(magnitude(service.getPosition()) > DEFAULT_RADIUS){
            Assert.fail("Start position exceeded radius");
        }
        Assert.assertTrue(magnitude(moveToTheExtentInDirection(this::moveLeft)) <= DEFAULT_RADIUS, "Position distance exceeded radius");
    }

    @Test
    public void testMovingUpDontExceedRadius(){
        if(magnitude(service.getPosition()) > DEFAULT_RADIUS){
            Assert.fail("Start position exceeded radius");
        }
        Assert.assertTrue(magnitude(moveToTheExtentInDirection(this::moveUp)) <= DEFAULT_RADIUS, "Position distance exceeded radius");
    }
}
