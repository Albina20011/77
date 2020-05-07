package kz.aitu.oop.examples.practice;

public class exercise2 {
    public boolean fileExists( String input ) {
        try {
            File.parseString( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }

    public boolean isInt( String input ) {
        try {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
    public boolean isDouble( String input ) {
        try {
            Double.parseDouble( input );
            return true;
        }
        catch( Exception e ) {
            return false;
        }
    }
}
