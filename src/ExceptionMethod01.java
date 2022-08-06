public class ExceptionMethod01 {

        public static void main(String[] args) {

            String s = "abcd 12345";
            int a;

            try {
                a = Integer.parseInt(s);
            }
            catch( Exception e ) {
                System.out.println( e.getMessage() );
            }

        }

    }

