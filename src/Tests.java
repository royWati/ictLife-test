public class Tests {

    public static void main(String[] args){
        String[][] img ={
                {"you","me"},
                {"us","we"}
        };


        for (String[] i : img){
            for (String j : i){
                System.out.println(j);
            }
        }
    }
}
