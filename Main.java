import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("We do not use Hello World😘");

        // single line comment

        /*
        multiple line comments
        comment line 1
        comment line 2
        comment line 3
         */

        /**
         *
         * @description - bu javadoc commenti
         *
         */

        System.out.println("NIMA GAP?😘");

        /*
        Integer data types
        byte -> 8 bit -> 1 -> 127; -128
        short -> 16 bit -> 2 -> 32.767; -32.768
        int -> 32 bit -> 4 -> 2 milliard
        long - 64 bit -> 8 -> 9 kvintillion

        // FLOATING POINT NUMBERS

        float -> 32 bit 4 (6,7) 12.3523655
        double -> 64 bit 8 (15) 25.123456789123456
         */

        /* float a = 12F;
         float b = 0F;
         float c = a / b;
         System.out.println(c);

         float d = 0F;
         float e = 0F;
         float f = d / e;
         System.out.println(f);
         System.out.println(Float.isNaN(f));

         byte t = 10;
         byte r = 15;
         int q = t + r;
         System.out.println(q);
         boolean isCorrect = ( q == 25);
         System.out.println("Natija to'g'rimi?👌: " + isCorrect);
         boolean b1 = Character.isJavaIdentifierPart(1);
         System.out.println(b1);
         boolean b2 = Character.isJavaIdentifierStart(1);
         System.out.println(b2);

         String message = "Hello PDP";
         System.out.println(message);
         System.err.println(message);
         System.out.print("nima gapmikan😒");

        Scanner readConsole = new Scanner(System.in);
        String FullName = readConsole.nextLine(); // next o'zi ham kelishi mumkin faqatgina brigina so'zni oladi
        System.out.print("Salom ");
        System.out.println(FullName);

        long a1;
         if (readConsole.hasNextLong()) {
            a1 = readConsole.nextLong();
         } else {
            a1 = 12;
         }
         System.out.println(a1 * 4);
          Scanner ConsoleRead = new Scanner(System.in);
         System.out.print("username: ");
         String username = ConsoleRead.nextLine();
         System.out.print("password: ");
         String password = ConsoleRead.nextLine();
         System.out.println("Logged in 😊");

         Console console = System.console();
         String username = console.readLine("username : ");
         String password = new String(console.readPassword("password : "));
         System.out.print(username);
         System.out.print(" : ");
         System.out.print(password);

        Scanner Console1 = new Scanner(System.in);
         int age = Console1.nextInt();
         Console1.nextLine();
         String name = Console1.nextLine();
         System.out.println(age);
         System.out.println(name);

       /* Scanner proba = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = proba.nextInt();
        proba.nextLine();
        System.out.print("Enter your name: ");
        String name = proba.nextLine();
        System.out.println("\n---- Your information ----");
        System.out.println("Your age: " + age);
        System.out.println("Your name: " + name);

        */

        // 2 dars uyga vazifa
       /*
        Scanner arifmetika = new Scanner(System.in);
        System.out.print("Birinchi son: ");
        int son1 = arifmetika.nextInt();
        System.out.print("ikkinchi son: ");
        int son2 = arifmetika.nextInt();
        System.out.print("uchinchi son: ");
        int son3 = arifmetika.nextInt();
        int arifmetika1 = (son1 + son2 + son3) / 3;
        System.out.println("Javob: " + arifmetika1);
        arifmetika.close();
       */
         // uyga vazifa ikkinchisi

       /* Scanner kvadrat = new Scanner(System.in);
        System.out.print("tomonlari: ");
        double tomon = kvadrat.nextDouble();
        double perimetri = 4 * tomon;
        double yuzasi = tomon * tomon;
        System.out.println("perimetri: " + perimetri);
        System.out.println("yuzasi: " + yuzasi);
        kvadrat.close();
        */

        // uyga vazifa uchinchisi

       /* Scanner malumotlar = new Scanner(System.in);
        System.out.print("Stringni kiriting: ");
        String matn = malumotlar.nextLine();
        System.out.print("Byteni kiriting: ");
        Byte B = malumotlar.nextByte();
        System.out.print("Shortni kirting: ");
        Short S = malumotlar.nextShort();
        System.out.print("Intni kiriting: ");
        int I = malumotlar.nextInt();
        System.out.print("longni kiritaqoling: ");
        long L = malumotlar.nextLong();
        System.out.print("Float kasr sondan please: ");
        float F = malumotlar.nextFloat();
        System.out.print("Double kasrdanam bo'sn: ");
        double D = malumotlar.nextDouble();
        System.out.print("Booleandanam kiritvoradigan joyi: ");
        boolean bool = malumotlar.nextBoolean();

        System.out.println("YOZGANLARINGIZ😊");
        System.out.println("String: " + matn);
        System.out.println("Byte: " + B);
        System.out.println("Short: " + S);
        System.out.println("Integer: " + I);
        System.out.println("Long: " + L);
        System.out.println("Float " + F);
        System.out.println("Double: " + D);
        System.out.println("Boolean: " + bool);
        malumotlar.close();

        */
        // uyga vazifa to'rtinchisi

        /* Scanner kirish = new Scanner(System.in);
        System.out.print("birinchi son: ");
        int son1 = kirish.nextInt();
        System.out.print("ikkinchi son: ");
        int son2 = kirish.nextInt();
        int javob = son1 + son2;
        System.out.println("javob: " + javob);



        // 3 dars

        int a = 12;
        int b = 2;
        int result = a + b;
        System.out.println(result);
        int c = 5;
        int resultOfModulus = a % c;
        System.out.println(resultOfModulus);

        byte b1 = 12;
        short sh = b1; // bu yerda konvertatsiya jarayoni ketmoqda, va ma'lumot yo'qolmayapti
        int i = b1;
        System.out.println(b1);
        System.out.println(sh);
        System.out.println(i);

        int n1 = 123456789;
        float f1 = n1;
        System.out.println(n1);
        System.out.println(f1);
        System.out.println("-------"); // intdan floatga otganda malumot yoqoladi
        int n2 = (int) f1;
        System.out.println(n2);

        int a2 = 12;
        float a3 = 2; // istalgan bitta aperant float bolsa javob ham float qaytadi
        double d1 = 12 + 2D; // ikkita aperandaning bittasi double bolsa javob ham double qaytadi
        long r3 = 12 + 2L; // aperandalarning istalgan biri long  bolsa javob ham long qaytadi
        int r4 = 12 +4L; // agar ikkalasi ham integer tipida bolsa javob ham integer boladi

         */

        short sh1 = 123;
        byte i1 = (byte) sh1;
        long L = 132456;
        int I2 = (int) L;
        System.out.println(i1);
        System.out.println(I2);

       /* int x = 12;
        x += 2; // x = x + 2;
        x *= 2; // x = x * 2;
        System.out.println(x);



        int counter = 0;
        counter ++;
        System.out.println(counter);
        counter ++;
        System.out.println(counter);
        int counter1 = 10;
        counter1 --;
        System.out.println(counter1);
        counter1 --;
        System.out.println(counter1);
        int n = 4;
        int m = 4;
        int x = 5;
        int y = 5;
        x = x * n++;
        y = y * ++m;
        System.out.println(x);
        System.out.println(y);

        System.out.println(n);
        System.out.println(m);


        int x = 12;
        int z = 12;
        // == tenglik
        // > kattalik
        // >= yoki katta yoki katta
        boolean r1 = (x == z);
        boolean r2 = (x > z);
        boolean r3 = (x >= z);
        boolean r4 = (x < z);
        boolean r5 = (x <= z);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);


        int age = 28;
        int gender = 0;
        boolean expression1 = age > 28;
        boolean expression2 = gender == 1;
        // boolean r1 = expression1 && expression2;
        boolean r1 = expression1 || expression2;
        System.out.println(r1);

        System.out.println(true);
        System.out.println(!true);
        System.out.println(!false);

        int x4 = 12;
        int y4 = 90;
        int max;
       //  boolean expression4 = x4 > y4;
       // if (expression4) { max = x4; } else { max = y4; }
        // max = expression4 ? x4 : y4;
        max = x4 > y4 ? x4 : y4; // shunaqa yozsayam boladi
        System.out.println(max);


        // 001 - 1
        // 010 - 2
        // 011 - 3
        // 100 - 4
        // 101 - 5
        // 110 - 6
        // 111 - 7

        int q1 = 5; // 101  = 111 = 7
        int q2 = 2; // 010
        int r1 = q1 | q2;
        System.out.println(r1);
        int r2 = 0b111;
        System.out.println(r2);
        int r3 = 0b111010101;
        System.out.println(r3);
        int r4 = q1 & q2;
        System.out.println(r4);
        int r5 = q1 ^ q2;
        System.out.println(r5);

        System.out.println(~4); // agar musbat bo'sa bitta kopayb manfiy boladi javob -5
        System.out.println(~-4); // agar manfiy bosa bittaga kamayib musbat boladi javob 3


        int w1 = 0b00011001; // 25
        int a1 = w1 << 1;
        // 0 0 1 1 0 0 1 0 left shiftingda chaptan bitta raqam olib tashlanadi va o'ng tarafga otqaziladi; yani chapdan olib o'nga suriladi
        System.out.println(a1);
        System.out.println(0b00011001);
        int a2 = w1 >> 1;
        System.out.println(a2);


       double math = Math.random();
        System.out.println(math);
        int w2 = 15;
        int w3 = 90;
        int max = Math.max(w2,w3);
        System.out.println(max);
        int min = Math.min(w2, w3);
        System.out.println(min);
        System.out.println(Math.abs(-100));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.pow(12, 4));
        System.out.println(Math.PI);
        System.out.println(Math.E);
        int d = 1_000_000_000;
        int g = Math.multiplyExact(d, 3); // int g = d * 3;
        System.out.println(g);

        */

        /* int a = 23;
        int b = 45;
        boolean r1 = a == b;
        System.out.println(r1);

        int asos = 7;
        int daraja = 5;
        int natija = (int) Math.pow(asos, daraja);
        System.out.println(asos + " ning " + daraja + "-darajasi: " + natija);


        Scanner taqqoslash = new Scanner(System.in);
        System.out.print("birinchi son: ");
        int a = taqqoslash.nextInt();
        System.out.print("ikkinchi son: ");
        int b = taqqoslash.nextInt();
        if (a > b) {
            System.out.println("Katta son: " + a);
        } else if (b > a) {
            System.out.println("Katta son: " + b);
        } else {
            System.out.println("Ikkala son ham teng: " + a + " va " + b);
        }


        Scanner uchxonalison = new Scanner(System.in);
        System.out.print("3 xonali son kiriting: ");
        int son = uchxonalison.nextInt();
        int yuzlik = son / 100;
        int onlik = (son / 10) % 10;
        int birlik = son % 10;
        System.out.println("Yuzlik: " + yuzlik);
        System.out.println("O'nLik: " + onlik);
        System.out.println("Birlik: " + birlik);


        Scanner Tortxonali = new Scanner(System.in);
        System.out.print("To'rt xonali son kiriting: ");
        int A4 = Tortxonali.nextInt();
        int minglik = A4 / 1000;
        int yuzlik = (A4 / 100) % 10;
        int onlik = (A4 / 10) % 10;
        int birlik = A4 % 10;
        System.out.println(minglik);
        System.out.println(yuzlik);
        System.out.println(onlik);
        System.out.println(birlik);


        Scanner jufttoq = new Scanner(System.in);
        System.out.print("butun son kiriting: ");
        int son = jufttoq.nextInt();
        String natija = (son % 2 == 0) ? "Juft" : "Toq";
        System.out.println(son + " soni " + natija);


        Scanner uchtaSon = new Scanner(System.in);
        System.out.print("Birinchi sonni yozing: ");
        int son1 = uchtaSon.nextInt();
        System.out.print("Ikkinchi sonni yozing: ");
        int son2 = uchtaSon.nextInt();
        System.out.print("Uchinchi sonni yozing: ");
        int son3 = uchtaSon.nextInt();
        int engKattasi = (son1 > son2) ? ((son1 > son3) ? son1 : son3) : ((son2 > son3) ? son2 : son3);
        System.out.println("Eng katta raqam: " + engKattasi);



        Scanner bitwise = new Scanner(System.in);
        System.out.print("Son kiriting: ");
        int son5 = bitwise.nextInt();
        String javob = ((son5 % 1) == 0) ? "Juft" : "Toq";
        System.out.println("natija: " + javob);

         */
        Scanner kiritish = new Scanner(System.in);
        System.out.print("Masofani kiriting: ");
        int masofa = kiritish.nextInt();
        System.out.print("1-mashina tezligini kiriting: ");
        int mashina1 = kiritish.nextInt();
        System.out.print("2-mashina tezligini kiriting: ");
        int mashina2 = kiritish.nextInt();
        int vaqt = masofa / (mashina1 + mashina2);
        int masofa1 = mashina1 * vaqt;
        int masofa2 = mashina2 * vaqt;
        System.out.println("uchrashish soati: " + vaqt);
        System.out.println("1-mashina yurgan yol: " + masofa1);
        System.out.println("2-mashina yurgan yol: " + masofa2);






    }
}