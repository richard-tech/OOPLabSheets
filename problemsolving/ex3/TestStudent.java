package problemsolving.ex3;

public class TestStudent {

    public static void main(String[] args) {


        Student student1 = new Student("Tim", "Computing",new String []{"Maths","Java","Web Dev"});

        Student student2 = new Student("Ita", "Social",new String []{"Intro to Social","P"});

        Student allStudents[] = {student1,student2};

        System.out.println("Calling the static method getCount() to determine the number of students in the college" +
               "\n\nTotal students in college: " + Student.getCount() );

        System.out.println("Displaying the state of the " + Student.getCount());

        for(int i=0; i<Student.getCount();i++){
            System.out.println("\n\nStudent "  + (i+1)  +"\n\n"+
                    allStudents[i]);
        }


    }
}