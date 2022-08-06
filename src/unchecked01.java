public class unchecked01 {

        public static void main(String[] args) {

            try {
                int[] a = new int [5];
                System.out.println( a[10] );
            }
            catch( Exception e ) {
                System.out.println( "Exception thrown: " + e );}
            System.out.println( "The program still work properly" );

        }

    }

