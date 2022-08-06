public class unchecked02 {

        public static void main(String[] args) {

            String s = "1234567891011121314151617181920212223";
            int a;

            try {
                System.out.println( "s.charAt(28): " + s.charAt(28) );
                a = Integer.parseInt(s);
            }
            catch( StringIndexOutOfBoundsException e1 ) {
                System.out.println( "Index is not exist in the string!" );
            }
            catch( NumberFormatException e2 ) {
                System.out.println( "Can't convert 's' to a number because is to long!" );
            }
            catch( Exception e3 ) {
                System.out.println( "Exception thrown: " + e3 );
            }

            System.out.println( "The program still work properly" );

        }

    }
