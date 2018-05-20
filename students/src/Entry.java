
import university.entry.faculty.factory.impl.LawDistributor;
import university.entry.faculty.factory.impl.MedicalDistributor;
import university.entry.models.Abiturient;
import university.entry.models.Student;
import university.entry.models.University;

public class Entry {
   // private final List<Twitter> list = new ArrayList<>();

    public  static void main(String[] args){

        University university = new University();
        university.addAbiturientToUniversity(new Abiturient("Владимир", "Петров",new LawDistributor()));
        university.addAbiturientToUniversity(new Abiturient("Владимир", "Иванов",new MedicalDistributor()));

        university.distributeStudentByFaculty();
       /*
        System.out.println(student);
        Entry entry = new Entry();
        entry.list.addAll(
                Arrays.asList(
                        entry.new Channel_1(),
                        entry.new Channel_2(),
                        entry.new Channel_3(),
                        entry.new Channel_4(),
                        entry.new Channel_5()
                )
        );
        entry.notify("news_1");
        entry.notify("news_2");
        entry.notify("news_3");
        entry.notify("news_4");
        entry.notify("news_5");
    }

    interface Twitter {
         default void update(String news) {
            System.out.println(this.getClass().getName()+" "+ news);
        }
    }

    public class Channel_1 implements Twitter{}
    public class Channel_2 implements Twitter{}
    public class Channel_3 implements Twitter{}
    public class Channel_4 implements Twitter{}
    public class Channel_5 implements Twitter{}

    public void notify(String news) {
        list.forEach(chanel->chanel.update(news));
    }*/
}}