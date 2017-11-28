package collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        
        People p1 = new People("Mert", "man", 143, "Turkish", 37);
        People p2 = new People("Emma", "women", 113, "French", 40);
        People p3 = new People("Zeynep", "women", 123, "Turkish", 45);
        People p4 = new People("Merlin", "man", 813, "French", 30);
        

        System.out.println("----------------Hash Set--------------------------");
        
        //Veriler sırasız bir şekilde saklanır. Aynı veriden birden fazla tutmaz.

        HashSet hset = new HashSet();

        hset.add(21);
        hset.add(45);
        hset.add(65);
        hset.add("buda");
        hset.add("mert");
        hset.add("mert");
        hset.add(789);
        hset.add(p2.toString());
        hset.add(p1.toString());
        //hset.remove(789);
        String s = null;

        Iterator i = hset.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("-----Linked hash set------------------------------");

        //Elemanları giriş sırasına göre çift yönlü bağlar.
        
        LinkedHashSet LHS = new LinkedHashSet();

        LHS.add("1");
        LHS.add("12");
        LHS.add(123);
        LHS.add("1234");
        LHS.add(12345);
        LHS.add("123456");
        LHS.add(p1.toString());

        Iterator i2 = LHS.iterator();

        while (i2.hasNext()) {
            System.out.println(i2.next());
        }
        System.out.println("--------Tree Set----------------------------------");
        
        //Sorted set interfacesinin subclass'ıdır.
        //TreeSet'te yalnızca ayını tipteki verileri tutabiliriz.

        TreeSet treeset = new TreeSet();
        String[] arr = {"izmir", "istanbul", "adana", "bursa", "zonguldak"};

        for (String x : arr) {
            treeset.add(x);
        }
        Iterator i3 = treeset.iterator();
        while (i3.hasNext()) {
            System.out.println(i3.next());
        }
        //Tek tip veri göderebiliriz  //Verileri artan sıralı olarak tutar
        System.out.println("ilk eleman : " + treeset.first());
        System.out.println("son eleman : " + treeset.last());
        System.out.println("Belirlenen aralıktaki elemanlar: " + treeset.subSet("bursa", "zonguldak"));

        System.out.println("------------ArrayList-----------------------------");
        
        //Elemanları bir array biçiminde saklar ve boyutu içine veri aldıkça büyür.
        //Elemanlara indis değerleriyle erişmek ve silmek mümkündür.

        ArrayList alist = new ArrayList();

        alist.add(p1.toString());
        alist.add(p2.toString());
        alist.add(p3.toString());
        alist.add(p4.toString());
        alist.add(67);
        alist.add(p1.toString());

        ListIterator j = alist.listIterator();

        while (j.hasNext()) {
            System.out.println(j.nextIndex() + ". " + j.next());
        }

        System.out.println("=Tersten=");

        while (j.hasPrevious()) {
            System.out.println(j.previousIndex() + ". " + j.previous());
        }
        System.out.println(alist.get(1));
        
        System.out.println("----------------LinkedList------------------");
        
        LinkedList linkedList = new LinkedList();
        
        linkedList.add(4);
        linkedList.add(p2);
        linkedList.add(p3);
        linkedList.add("last element");
        
        System.out.println(linkedList);    //tüm listeyi getir.
        System.out.println(linkedList.getFirst());   //listenin ilk elemanını getir
        System.out.println(linkedList.getLast());    //listenin son elemanını getir
        
        System.out.println("----------------Vector----------------------------");
        
        //Vector collection'u ArrayList collection'una benzer ancak Vector collection'u synchronoustur(senkronize).
        //Bundan dolayı ArrayList daha daha hızlı ve performanslıdır.
        //Vektörlerin kapasitesinin ne kadar artacağını uygulamalar belirleyebilir.
        
        final int kapasite = 5;
        final int artis = 4;
        
        Vector vector = new Vector(kapasite, artis);
        
        vector.add(5);
        vector.add(10);
        vector.add(14);
        vector.add(20);
        vector.add(24);
        
        System.out.println("Vector'un kapasitesi : " + vector.capacity());
        System.out.println("ilk eleman : " + vector.firstElement());
        System.out.println("son eleman : " + vector.lastElement());
        
        vector.add(5);
        
        System.out.println("Vector'un kapasitesi : " + vector.capacity());
        System.out.println("3. eleman : " + vector.elementAt(2));
        
        
        System.out.println("----------------Queue----------------------------");
        
        Queue queue = new LinkedList();
        
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);
        
        queue.offer(p4);  //offer ile eleman eklerken sorun çıkarsa geriye false değer döner.
        
        while(!queue.isEmpty())
        {
            System.out.println("Kuyrukta bekleyn eleman : " + queue.peek());
            System.out.println("Kuyrukta bekleyen elemanı getir : " + queue.poll());
        }
        

        System.out.println("----------------HashMap----------------------------");

        HashMap hash = new HashMap(10, 0.75f);

        hash.put("123", p1);
        hash.put("113", p2);
        hash.put("143", p3);
        hash.put("813", p4);

        Set data = hash.entrySet();
        Set key = hash.keySet();
        System.out.println("=Data=");
        Iterator i4 = data.iterator();
        while (i4.hasNext()) {
            System.out.println(i4.next());
        }
        System.out.println("=Keys=");
        Iterator i5 = key.iterator();
        while (i5.hasNext()) {
            System.out.println(i5.next());
        }
        
        
        System.out.println("----------------LinkedHashMap----------------------------");
        
        LinkedHashMap lhm = new LinkedHashMap();
        
        //ASCII tablosundaki 65-85 arasındaki değerleri ve anahtarları kaydediyoruz.
        for(int a=65;a<=85;a++)
        {
            lhm.put((char)a, a);
            }
            Set anahtarlar = lhm.keySet();
            System.out.println("LinkedHashMap elemanları : ");
            System.out.println(lhm);
            System.out.println("LinkedHashMap elemanlarının keyleri : ");
            System.out.println(anahtarlar);           
        
            
        
        
            
        
        /******************  OUTPUTS  *****************************/
        
        
        
     /* ----------------Hash Set--------------------------
HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
65
HUMAN{name=Emma, gender=women, ID=113, uyruk=French, age=40}
21
789
mert
45
buda
-----Linked hash set------------------------------
1
12
123
1234
12345
123456
HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
--------Tree Set----------------------------------
adana
bursa
istanbul
izmir
zonguldak
ilk eleman : adana
son eleman : zonguldak
Belirlenen aralıktaki elemanlar: [bursa, istanbul, izmir]
------------ArrayList-----------------------------
0. HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
1. HUMAN{name=Emma, gender=women, ID=113, uyruk=French, age=40}
2. HUMAN{name=Zeynep, gender=women, ID=123, uyruk=Turkish, age=45}
3. HUMAN{name=Merlin, gender=man, ID=813, uyruk=French, age=30}
4. 67
5. HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
=Tersten=
5. HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
4. 67
3. HUMAN{name=Merlin, gender=man, ID=813, uyruk=French, age=30}
2. HUMAN{name=Zeynep, gender=women, ID=123, uyruk=Turkish, age=45}
1. HUMAN{name=Emma, gender=women, ID=113, uyruk=French, age=40}
0. HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
HUMAN{name=Emma, gender=women, ID=113, uyruk=French, age=40}
----------------LinkedList------------------
[4, HUMAN{name=Emma, gender=women, ID=113, uyruk=French, age=40}, HUMAN{name=Zeynep, gender=women, ID=123, uyruk=Turkish, age=45}, last element]
4
last element
----------------Vector----------------------------
Vector'un kapasitesi : 5
ilk eleman : 5
son eleman : 24
Vector'un kapasitesi : 9
3. eleman : 14
----------------Queue----------------------------
Kuyrukta bekleyn eleman : HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
Kuyrukta bekleyen elemanı getir : HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
Kuyrukta bekleyn eleman : HUMAN{name=Emma, gender=women, ID=113, uyruk=French, age=40}
Kuyrukta bekleyen elemanı getir : HUMAN{name=Emma, gender=women, ID=113, uyruk=French, age=40}
Kuyrukta bekleyn eleman : HUMAN{name=Zeynep, gender=women, ID=123, uyruk=Turkish, age=45}
Kuyrukta bekleyen elemanı getir : HUMAN{name=Zeynep, gender=women, ID=123, uyruk=Turkish, age=45}
Kuyrukta bekleyn eleman : HUMAN{name=Merlin, gender=man, ID=813, uyruk=French, age=30}
Kuyrukta bekleyen elemanı getir : HUMAN{name=Merlin, gender=man, ID=813, uyruk=French, age=30}
----------------HashMap----------------------------
=Data=
143=HUMAN{name=Zeynep, gender=women, ID=123, uyruk=Turkish, age=45}
123=HUMAN{name=Mert, gender=man, ID=143, uyruk=Turkish, age=37}
113=HUMAN{name=Emma, gender=women, ID=113, uyruk=French, age=40}
813=HUMAN{name=Merlin, gender=man, ID=813, uyruk=French, age=30}
=Keys=
143
123
113
813
----------------LinkedHashMap----------------------------
LinkedHashMap elemanları : 
{A=65, B=66, C=67, D=68, E=69, F=70, G=71, H=72, I=73, J=74, K=75, L=76, M=77, N=78, O=79, P=80, Q=81, R=82, S=83, T=84, U=85}
LinkedHashMap elemanlarının keyleri : 
[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U]
        */

    }
}
