package prakpemlan1;

public class library {
    String judul; 
    String namaPenulis;
    int jumlahHalaman;
    int tahunTerbit;
    String sinopsis;

    public library (){
    }

    public library(String judul, String namaPenulis, int jumlahHalaman, int tahunTerbit, String sinopsis){
        this.judul = judul;
        this.namaPenulis = namaPenulis;
        this.jumlahHalaman = jumlahHalaman;
        this.tahunTerbit = tahunTerbit;
        this.sinopsis = sinopsis;
    }

    public void teknologi(){
        library t1= new library("The Innovators: How a Group of Hackers, Geniuses, and Geeks Created the Digital Revolution", "Walter Isaacson" , 560, 2014, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptates, nulla.");
        t1.tampillist();
        library t2 = new library("Sapiens: A Brief History of Humankind" , "Yuval Noah", 464, 2011, "Lorem ipsum, dolor sit amet consectetur adipisicing elit. Repellat, labore incidunt!");
        t2.tampillist();
        library t3= new library("Steve Jobs", "Walter Isaacson", 656, 2011, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore quaerat minus facilis!");
        t3.tampillist();
        library t4 = new library("Zero to One: Notes on Startups, or How to Build the Future" , "Peter Thiel", 224, 2014, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        t4.tampillist();
        library t5 = new library("The Phoenix Project: A Novel about IT, DevOps, and Helping Your Business Win", "Gene Kim", 376, 2013, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        t5.tampillist();
    }

    public void filsafat(){
        library f1 = new library("Meditations", "Marcus Aurelius", 304, 2021, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        f1.tampillist();
        library f2 = new library("Sophie's World", "Jostein Gaarder", 544, 1991, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        f2.tampillist();
        library f3 = new library("The Republic" , "Plato", 417, 380, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        f3.tampillist();
        library f4 = new library("Thus Spoke Zarathustra", "Friedrich Nietzsche", 352, 1883, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam voluptas ipsa officiis aliquid omnis.");
        f4.tampillist();
        library f5 = new library("The Consolations of Philosophy", "Alain de Botton", 272, 2000, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam voluptas ipsa officiis aliquid omnis.");
        f5.tampillist();

    }
    public void sejarah(){
        library s1 = new library("A People's History of the United States", "Howard Zinn", 784, 1980, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam voluptas ipsa officiis aliquid omnis.");
        s1.tampillist();
        library s2 = new library("Guns, Germs, and Steel: The Fates of Human Societies", "Jared Diamond", 528, 1997, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        s2.tampillist();
        library s3 = new library("The Silk Roads: A New History of the World", "Peter Frankopan", 672, 2015, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        s3.tampillist();
        library s4 = new library("SPQR: A History of Ancient Rome", "Mary Beard", 608, 2015, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        s4.tampillist();
        library s5 = new library("Sapiens: A Brief History of Humankind" , "Yuval Noah Harari", 464, 2011, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate tempora officia molestias reiciendis, error unde.");
        s5.tampillist();
    }
    public void agama(){
        library a1 = new library("The Case for Christ: A Journalist's Personal Investigation of the Evidence for Jesus", "Lee Strobel", 336, 1998, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate tempora officia molestias reiciendis, error unde.");
        a1.tampillist();
        library a2 = new library("The Tao of Pooh" , "Benjamin Hoff", 158, 1982, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        a2.tampillist();
        library a3 = new library("Buddhism Plain and Simple", "Steve Hagen", 176, 1997, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        a3.tampillist();
        library a4 = new library("The Road Less Traveled: A New Psychology of Love, Traditional Values, and Spiritual Growth" , "M. Scott Peck", 316, 1978, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam voluptas ipsa officiis aliquid omnis.");
        a4.tampillist();
        library a5 = new library("The Varieties of Religious Experience", "William James", 534, 1902, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        a5.tampillist();
    }
    public void psikologi(){
        library p1 = new library("Man's Search for Meaning", "Viktor E", 168, 1946, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        p1.tampillist();
        library p2 = new library("Thinking, Fast and Slow", "Daniel Kahneman", 512, 2011, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate tempora officia molestias reiciendis, error unde.");
        p2.tampillist();
        library p3 = new library("The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", 400, 2012, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam voluptas ipsa officiis aliquid omnis.");
        p3.tampillist();
        library p4 = new library("Quiet: The Power of Introverts in a World That Can't Stop Talking" , "Susan Cain", 352, 2012, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        p4.tampillist();
        library p5 = new library("Emotional Intelligence: Why It Can Matter More Than IQ", "Daniel Goleman", 368, 1995, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        p5.tampillist();
    }
    public void politik(){
        library p1 = new library("The Prince", "Nicolo Machiavelli", 140, 1532, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam voluptas ipsa officiis aliquid omnis.");
        p1.tampillist();
        library p2 = new library("The Communist Manifesto", "Karl Marx", 48, 1848, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        p2.tampillist();
        library p3 = new library( "Democracy in America", "Alexis", 976, 1835, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Cupiditate tempora officia molestias reiciendis, error unde.");
        p3.tampillist();
        library p4 = new library("Capital in the Twenty-First Century" , "Thomas Piketty", 696, 2013, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        p4.tampillist();
        library p5 = new library("The Federalist Papers", "Alexander Hamilton", 688, 1788, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        p5.tampillist();
    }
    public void fiksi(){
        library f1 = new library("1984", "George Orwell", 328, 1949, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        f1.tampillist();
        library f2 = new library("To Kill a Mockingbird", "Harper Lee", 336, 1960, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        f2.tampillist();
        library f3 = new library( "The Great Gatsby", "F. Scott Fitzgerald", 180, 1925, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        f3.tampillist();
        library f4 = new library("Pride and Prejudice"  , "Jane Austen", 432, 1813, "Lorem ipsum dolor sit amet consectetur adipisicing elit. In eveniet consectetur cupiditate!");
        f4.tampillist();
        library f5 = new library("One Hundred Years of Solitude", "Gabriel Garcia", 417, 1967, "Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam, voluptates quis?");
        f5.tampillist();
    }
    
        
    
    public void tampillist(){
            System.out.println("judul           =" + judul);
            System.out.println("nama penulis    =" + namaPenulis);
            System.out.println("jumlah halaman  =" + jumlahHalaman);
            System.out.println("tahun terbit    =" + tahunTerbit);
            System.out.println("sinopsis        = " + sinopsis);
            System.out.println("Jumlah kata   = " + hitungKata(sinopsis));
            System.out.println();   
    }
    public int hitungKata(String sinopsis){
          return sinopsis.split(" ").length;   
    }

}
