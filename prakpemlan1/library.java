package prakpemlan1;

public class library {
    String judul; 
    String namaPenulis;
    int jumlahHalaman;
    int tahunTerbit;

    public library (){
    }

    public library(String judul, String namaPenulis, int jumlahHalaman, int tahunTerbit){
        this.judul = judul;
        this.namaPenulis = namaPenulis;
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
    }

    public void teknologi(){
        library t1= new library("The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson" , 560, 2014);
        t1.tampillist();
        library t2 = new library("Sapiens: A Brief History of Humankind" , "Yuval Noah", 464, 2011);
        t2.tampillist();
        library t3= new library("Steve Jobs", "Walter Isaacson", 656, 2011);
        t3.tampillist();
        library t4 = new library("Zero to One: Notes on Startups, or How to Build the Future" , "Peter Thiel", 224, 2014);
        t4.tampillist();
        library t5 = new library("The Phoenix Project: A Novel about IT, DevOps, and Helping Your Business Win", "Gene Kim", 376, 2013);
        t5.tampillist();
    }

    public void filsafat(){
        library f1 = new library("Meditations", "Marcus Aurelius", 304, 2021);
        f1.tampillist();
        library f2 = new library("Sophie's World", "Jostein Gaarder", 544, 1991);
        f2.tampillist();
        library f3 = new library("The Republic" , "Plato", 417, 380);
        f3.tampillist();
        library f4 = new library("Thus Spoke Zarathustra", "Friedrich Nietzsche", 352, 1883);
        f4.tampillist();
        library f5 = new library("The Consolations of Philosophy", "Alain de Botton", 272, 2000);
        f5.tampillist();

    }
    public void sejarah(){
        library s1 = new library("A People's History of the United States", "Howard Zinn", 784, 1980);
        s1.tampillist();
        library s2 = new library("Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", 528, 1997);
        s2.tampillist();
        library s3 = new library("The Silk Roads: A New History of the World", "Peter Frankopan", 672, 2015);
        s3.tampillist();
        library s4 = new library("SPQR: A History of Ancient Rome", "Mary Beard", 608, 2015);
        s4.tampillist();
        library s5 = new library("Sapiens: A Brief History of Humankind" , "Yuval Noah Harari", 464, 2011);
        s5.tampillist();
    }
    public void agama(){
        library a1 = new library("The Case for Christ: A Journalist's Personal Investigation of the Evidence for Jesus", "Lee Strobel", 336, 1998);
        a1.tampillist();
        library a2 = new library("The Tao of Pooh" , "Benjamin Hoff", 158, 1982);
        a2.tampillist();
        library a3 = new library("Buddhism Plain and Simple", "Steve Hagen", 176, 1997);
        a3.tampillist();
        library a4 = new library("The Road Less Traveled: A New Psychology of Love, Traditional Values, and Spiritual Growth" , "M. Scott Peck", 316, 1978);
        a4.tampillist();
        library a5 = new library("The Varieties of Religious Experience", "William James", 534, 1902);
        a5.tampillist();
    }
    public void psikologi(){
        library p1 = new library("Man's Search for Meaning", "Viktor E", 168, 1946);
        p1.tampillist();
        library p2 = new library("Thinking, Fast and Slow", "Daniel Kahneman", 512, 2011);
        p2.tampillist();
        library p3 = new library("The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", 400, 2012);
        p3.tampillist();
        library p4 = new library("Quiet: The Power of Introverts in a World That Can't Stop Talking" , "Susan Cain", 352, 2012);
        p4.tampillist();
        library p5 = new library("Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", 368, 1995);
        p5.tampillist();
    }
    public void politik(){
        library p1 = new library("The Prince", "Nicolo Machiavelli", 140, 1532);
        p1.tampillist();
        library p2 = new library("The Communist Manifesto", "Karl Marx", 48, 1848);
        p2.tampillist();
        library p3 = new library( "Democracy in America", "Alexis", 976, 1835);
        p3.tampillist();
        library p4 = new library("Capital in the Twenty-First Century" , "Thomas Piketty", 696, 2013);
        p4.tampillist();
        library p5 = new library("The Federalist Papers", "Alexander Hamilton", 688, 1788);
        p5.tampillist();
    }
    public void fiksi(){
        library f1 = new library("1984", "George Orwell", 328, 1949);
        f1.tampillist();
        library f2 = new library("To Kill a Mockingbird", "Harper Lee", 336, 1960);
        f2.tampillist();
        library f3 = new library( "The Great Gatsby", "F. Scott Fitzgerald", 180, 1925);
        f3.tampillist();
        library f4 = new library("Pride and Prejudice"  , "Jane Austen", 432, 1813);
        f4.tampillist();
        library f5 = new library("One Hundred Years of Solitude", "Gabriel Garcia", 417, 1967);
        f5.tampillist();
    }
        
    
    public void tampillist(){
            System.out.println("judul           =" + judul);
            System.out.println("nama penulis    =" + namaPenulis);
            System.out.println("jumlah halaman  =" + jumlahHalaman);
            System.out.println("tahun terbit    =" + tahunTerbit);
            System.out.println();
        
        
    }

}
