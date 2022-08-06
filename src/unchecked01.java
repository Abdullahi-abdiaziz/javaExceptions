public class unchecked01 {

        public static void main(String[] args) {

            try {                              // try هنا قمنا بتجربة الكود الموجود بداخل الجملة
                int[] a = new int [5];         // هنا قمنا بإنشاء مصفوفة تتألف من 5 عناصر
                System.out.println( a[10] );   // catch هنا حاولنا عرض قيمة عنصر غير موجود في المصفوفة, لذلك سيحدث خطأ, مما سيؤدي رمي إستثناء إلى الدالة
            }
            catch( Exception e ) {                                // e هنا سيتم إلتقاط الإستثناء, ثم تخزينه في الكائن
                System.out.println( "Exception thrown: " + e );   // لنعرف طبيعة الخطأ الذي حدث e هنا قمنا بعرض محتوى الكائن
            }

            // بعد الإنتهاء من تجربة الكود سيتم تنفيذ باقي الأوامر الموجودة في البرنامج
            System.out.println( "The program still work properly" );

        }

    }

