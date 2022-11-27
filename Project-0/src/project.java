import java.util.*;
public class project {
    // region İkiye ve Üçe Bölünenlerin Hesaplaması Fonksiyonu

    public static void function() {
        Scanner input = new Scanner(System.in);
        int twoNumberSum = 0,twoDivisionAverage = 0;
        int threeNumberSum = 0,thereNumberAverage = 0;
        for(int i = 0; i<5; i++) {
            System.out.printf("%d . Sayıyı Giriniz : " , (i+1));
            int number = input.nextInt();

            if (number % 2 == 0){
                twoNumberSum +=number;
                twoDivisionAverage++;
            }
            if(number % 3 == 0) {
                threeNumberSum +=number;
                thereNumberAverage++;
            }
       }

        System.out.printf("İkiye Bölünen Sayıların Toplamı : %d Ortalaması : %f",twoNumberSum,(double)twoNumberSum/twoDivisionAverage);
        System.out.printf("Üçe Bölünen Sayıların Toplamı : %d Ortalaması : %f",threeNumberSum,(double)threeNumberSum/thereNumberAverage);

    }
    //endregion

    //region Sıralama Fonksyinonu
    public static void siralamaHesapla(){
        /* Soru 1 : Sıralama Sorusu:
                    Ali'nin boyu ve sınıf arkadaşlarının boyu rastgele veriliyor.
                    Öğrenciler Boy Sırasına dizildiğinde ali kaçıncı sıradadır.

                    aliBoy = 175 cm
                    Öğrencilerin Boyları : 175 , 185 , 165 , 175 , 182 , 173 , 182 , 175 (cm)
                    Bu boy oranlarının içinde ali'nin de boyu içindedir.
        * */
        int sinifMevcut = 8;
        int aliBoy = 175;
        int aliBoyDas = 0;
        int alidenUzunlar = 0;
        int boy;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i< sinifMevcut; i++){
            System.out.print((i+1)+ ".Boy (cm) : ");
            boy = input.nextInt();

            //aliBoy ile aynı boyda ise aliBoydas ++;
            if (boy == aliBoy) aliBoyDas++;
            else {
                if (boy > aliBoy) alidenUzunlar++;
            }
        }
        int ilkSira = alidenUzunlar+1; // Alinin İlk Bulunduğu sira. ÖR : aliden uzun 3 kişi varsa ali 4.sıradarır.
        int sonSira = aliBoyDas + alidenUzunlar;
        System.out.printf("Ali %d. - %d. sıra arasındadır.",ilkSira,sonSira);
    }
    //endregion

    //region Not Hesaplama Algoritması
    static void noteCalculator(){
        /*
          Notları matematiksel bir mantık ile açıklamayı seven bir öğretmen,sıra ile ilk
          öğrencinin notunu açıkladıktan sonra ,sonraki öğrencinin notunu ise kendinden bir önceki
          öğrencinin farkı olarak veriliyor.
          Bu sınıfın not ortalamasının bulun.
          ** Sınıf mevcudu 5 kabul ediliyor.
          ** İlk not ise 70 kabul edilecektir.
        */
        Scanner input = new Scanner(System.in);
        int ilkNot = 70;
        int toplam = ilkNot;
        int not;
        double ortalama;
        for(int i = 1; i<5; i++) {
            System.out.println(i + ". Not : ");
            not = input.nextInt();
            not +=ilkNot;
            toplam+=not;
            ilkNot = not;
            System.out.println(ilkNot);
        }
        ortalama = (double)toplam/5;
        System.out.printf("Average : %.2f",ortalama);
    }
    //endregion

    //region Metinsel İşlemler
    static void stringOperations(){
        String text = "vErilEn bir meTnin tüM KelimElerinin İlk harfleri BüYük DiĞEr HARfleri KüÇük OlaCak Şekilde DüzEnleYiniz";
        String new_text = "";
        for(String o: text.split(" ")){
            new_text = new_text + o.toLowerCase() + " ";
        }
        for(String out:new_text.split(" ")){
            new_text = "";
            new_text += out.substring(0,1).toUpperCase() + out.substring(1,out.length()) + " ";

            System.out.print(new_text);
        }
    }
    //endregion

    //region Metin İşlemleri 2
    static void s2(){
        String text = "vErilEn bir meTnin tüM KelimElerinin İlk harfleri BüYük DiĞEr HARfleri KüÇük OlaCak Şekilde DüzEnleYiniz";
        String s,str2="";
        boolean control = true;
        for (int i = 0; i < text.length(); i++) {
            s = text.substring(i,i+1);
            if (control) s = s.toUpperCase();
            else s = s.toLowerCase();
            str2+=s;
            if (s.equals(" ")) control = true;
            else control = false;
        }
        System.out.println(str2);
    }
    //endregion

    //region Sıralama işlemleri v2
    static void siralamaV2(int[] numberList) {
        int bigNumber = numberList[0];
        int counter = 0;
        for(int i = 0; i<numberList.length; i++){
            if(bigNumber<numberList[i]){
                bigNumber = numberList[i];
                counter = i;
            }
        }
        System.out.println("Dizinin En Büyük Elemanı " + bigNumber);
        System.out.println(counter + ". Sıradadır.");
    }
    //endregion

    //region Sıralama İşlemleri v3
    static void siralamaV3(){
        int[] numberList = new int[] { 10 , 13 , 56 , 20 , 40 , 60 , 56 , 32 , 86};
        int enKucuk = numberList[0];
        int enBuyuk = numberList[0];
        int enBuyukSira = 0,enKucukSira = 0;
        for (int i = 0; i<numberList.length; i++){
            if (numberList[i]<enKucuk) {
                enKucuk = numberList[i];
                enKucukSira = i;
            }
        }

        for(int j = 0; j<numberList.length; j++) {
            if(enBuyuk<numberList[j]){
                enBuyuk = numberList[j];
                enBuyukSira = j;
            }
        }
        numberList[enKucukSira] = enBuyuk;
        numberList[enBuyukSira] = enKucuk;

        for(int o:numberList) {
            System.out.println(o);
        }
    }
    //endregion

    //region Sıralama İşlemleri v4
    static void siralamaV4(){
        int[] numberList = new int[]{ 10 , 13 , 56 , 20 , 40 , 60 , 56 , 32 };
        int enBuyuk = numberList[0];
        int enKucuk = numberList[0];
        int sum = 0;
        int enKucukSira = 0,enBuyukSira = 0;

        for(int i = 0; i< numberList.length; i++) {
            if(numberList[i] > enBuyuk){
                enBuyuk = numberList[i];
                enBuyukSira = i;
            }
            if(enKucuk > numberList[i]){
                enKucuk = numberList[i];
                enKucukSira = i;
            }
        }
        if(enBuyukSira>enKucukSira) {
            for(int k = enKucukSira + 1; k < enBuyukSira; k++) {
                sum += numberList[k];
            }
        }
        else {
            for(int l = enBuyukSira + 1; l< enKucukSira; l++) {
                sum += numberList[l];
            }
        }
        System.out.println("En Küçük : " + enKucuk);
        System.out.println("En Büyük : " + enBuyuk);
        System.out.println("En Küçük Sıra : " + enKucukSira);
        System.out.println("En Büyük Sıra : " + enBuyukSira);
        System.out.printf("%d ile %d Arasındaki sayıların toplamı : %d" ,enKucuk,enBuyuk,sum);
    }

    //endregion

    //region Sıralama İşlemleri v5
    static void siralamav5(){
        short [] numberList = new short[]{ 70 , 80 , 90 , 65 , 75 , 90 , 69 , 72 , 87 , 90 , 75 };
        int counter = 0;
        int enBuyuk = numberList[0];
        for(int i =  0; i < numberList.length; i++) {
            if(numberList[i] > enBuyuk){
                enBuyuk = numberList[i];
            }
        }
        for(short o:numberList){
            if(enBuyuk == o) counter++;
        }
        System.out.println(counter);
    }
    //endregion

    //region Sıralama İşlemleri v6
    static void siralamaV6(){
        int[] notesList = new int[]{ 70 , 80 , 90 , 65 , 75 , 90 , 69 , 72 , 87 , 90 , 75 };
        int enBuyuk = notesList[0];
        for(int i = 0; i < notesList.length; i++ ) {
            if(notesList[i] > enBuyuk) enBuyuk = notesList[i];
        }
        int puanFark = 100 - enBuyuk;
        for(int j = 0; j < notesList.length; j++) {
            notesList[j] = notesList[j] + puanFark;
        }

        for(int o:notesList) System.out.print(o + " ");
    }
    //endregion

    //region Fibonacci Algoritması
    static void fibonacci(int number){
        int number1 = 1;
        int number2 = 1;
        int number3;
        System.out.println(number1);
        System.out.println(number2);
        for(int i = 0; i < number -2; i++){
            number3 = number1 + number2;
            System.out.println(number3);
            number1 = number2;
            number2 = number3;
        }
    }
    //endregion

    //region Fibonacci II.Yöntem
    static void Fibonacciv2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci Number : ");
        int number = input.nextInt();
        int[] fibonacciList = new int[number];
        fibonacciList[0] = 0;
        fibonacciList[1] = 1;

        for(int i = 2; i< fibonacciList.length; i++) {
            //i = 5 f(3) = 2,f(4) = 3,
            //f[5] = f[3] + f[4];
            fibonacciList[i] = fibonacciList[i - 2] + fibonacciList[i -1];
        }
    }
    //endregion

    //region Kavrama
    static void kavrama(){
        /*
            Öğretmen öğrencilerin defter ihtiyacını karşılamak için sınıfa X adet defter getirmiştir.
            Öğrencilerin defter ihtiyacı azdan çoğa doğru sıralı bir tamsayı dizisi olarak verilmiştir.
            Öğretmen en fazla kaç öğrencinin defter ihtiyacını karşılamıştır.
        */
        Scanner input = new Scanner(System.in);
        int x; // Getirdiği Defter Sayısı Kullanıcıdan alınacak
        int studentCounter = 0;
        int[] ihtiyacListe = new int[]{ 1 , 3 , 3 , 5 , 6 , 10 , 20 , 50 , 100 };
        System.out.print("Kaç Adet Defter Mevcut : ");
        x = input.nextInt();
        for(int i = 0; i < ihtiyacListe.length; i++) {
            x = x - ihtiyacListe[i];
            studentCounter++;
            if(x < ihtiyacListe[i]) break;
        }
        System.out.println(studentCounter);
    }
    //endregion

    //region Sıralama İşlemleri v7
    static void siralamaV7(){
        /*
            Bir sınıftaki öğrencilerin boyları tam sayi olarak sırasız veriliyor,ayrıca bu sınıfın öğrencisi
            olan Ali'nin boyu veriliyor. Beden eğitimi dersinde büyükten küçüğe doğru öğrenciler sıralandığında
            Ali kaçıncı sıralar arasında olur. [En uzun öğrenci birinci sıradadır.Ali'nin boyu verilen dizi arasında yer alır.]
            Ali'nin boyu 175 cm olduğu kabul ediliyor.
        */
        int[] boylar = new int[] { 190 , 175 , 185 , 175 , 177 , 178 , 198 , 175 , 187 , 182 };
        int alidenUzunOgrenciSayisi = 0;
        int aliIleAynıBoydaOlanOgrenciSayisi = 0;
        int alininBoyu = 175;

        for(int i = 0; i < boylar.length; i++){
            if(boylar[i] > alininBoyu) alidenUzunOgrenciSayisi++;
            if(boylar[i] == alininBoyu) aliIleAynıBoydaOlanOgrenciSayisi++;
        }
        int altSira = aliIleAynıBoydaOlanOgrenciSayisi+1;
        int ustSira = alidenUzunOgrenciSayisi + aliIleAynıBoydaOlanOgrenciSayisi;
        System.out.println("Ali ile aynı boyda olan öğrenci sayısı : " + altSira);
        System.out.println("Aliden uzun olan öğrenci sayısı : " + ustSira);
    }
    //endregion

    public static void main(String[] args) {
    }

}
