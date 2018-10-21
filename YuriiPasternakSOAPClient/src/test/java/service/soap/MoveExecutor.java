package service.soap;

import com.epam.lab.service.IllegalPositionException;
import com.epam.lab.service.Position;

@FunctionalInterface
public interface MoveExecutor {
    Position execute() throws IllegalPositionException;
}
