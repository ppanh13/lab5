import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.io.FileWriter;

public class Task2{
    List<Integer> alpha = new LinkedList<>();
    LinkedList<Integer> beta = new LinkedList<>();
    LinkedList<Integer> gamma = new LinkedList<>();

    String filename;
    Task2(String filename) {this.filename = filename;};

    public void sorting(){

        Random random = new Random();
        for(int i=0; i<150; i++)
            alpha.add(random.nextInt(200)+1);
        System.out.println("Alpha = " + alpha.toString());
        gamma.addAll(alpha);
        for(int i=0; i<15; i++){
            int maxInt = 0;
            for(int j: gamma) {
                if(j>maxInt)
                    maxInt = j;
            }
            gamma.removeFirstOccurrence(maxInt);
            beta.add(maxInt);
        }

        String outputText = "Beta = " + beta.toString();
        System.out.println(outputText);

        try (FileWriter output = new FileWriter(filename)){
            output.write(outputText);
            output.close();
        }catch (IOException e){
            System.out.println("IOException");
        }
    }

}