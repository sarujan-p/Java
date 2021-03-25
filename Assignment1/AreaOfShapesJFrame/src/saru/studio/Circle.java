package saru.studio;

/**
 *
 * @author Saru
 */
public class Circle implements IShape{
    
    float pi=(float) 3.14;

    @Override
    public float calcArea(float lenght) {
        return pi * lenght * length; 
    }
    
}
