package saru.studio;

/**
 *
 * @author Saru
 */
public class Square implements IShape{

    @Override
    public float calcArea(float lenght) {
        return lenght* lenght;
    }
    
}
