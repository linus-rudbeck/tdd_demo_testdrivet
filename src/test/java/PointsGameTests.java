import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.distansakademin.PointsGame;

public class PointsGameTests {

    @Test
    void testScoreStartsAtZero(){
        // Arrange
        PointsGame game = new PointsGame();
        int expected = 0;

        // Act
        int result = game.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testAddScore(){
        // Arrange
        PointsGame game = new PointsGame();
        int expected = 10;

        // Act
        game.addScore(10);
        int result = game.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testAddMultipleScores(){
        // Arrange
        PointsGame game = new PointsGame();
        int expected = 20;

        // Act
        game.addScore(10);
        game.addScore(5);
        game.addScore(3);
        game.addScore(2);
        int result = game.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }


    @Test
    void testResetScore(){
        // Arrange
        PointsGame game = new PointsGame();
        int expected = 0;

        // Act
        game.addScore(100);
        game.reset();
        int result = game.getScore();

        // Assert
        Assertions.assertEquals(expected, result);
    }
}
