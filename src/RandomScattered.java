import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomScattered {

    /*
        the method isImageRandomlyScattered returns a boolean
        expression after compairing every possibility of
        mapping first image to to the second image.

        it takes the 2 images as paramaters
     */

    public static boolean isImageRandomlyScattered(String[][] image1,String[][] image2){

        List<String> pixelMatch = new ArrayList<>(); // matching pixel will be added here
        //comparing if the images have the same pixel lengths

        List<Integer> searchPositions = new ArrayList<>(); // will be used to store positions
        // of already searched pixels in image2 to avoid collisions in the search
        if(image1.length ==image2.length){

            /* create a nested loop in image1 to compare it
                items in image2
             */

            int counter =0; // counts the number of pixels present in image 1



            for(String[] img1 : image1){
                for (String pixel : img1){
                    counter++;

                    for (String[] img2 :image2){
                        int pixelPosition=0;
                        /* the above variable allocates every pixel a unique postion
                            that would help in checking if pixel had already been
                            found in the previous search, if so -> continue
                            else pixel in 1 has no other match
                         */
                        for (String pixel2 : img2){
                            pixelPosition++;
                            // comparing pixel and pixel2
                            if(pixel.equals(pixel2)){
                                /* check if position of pixel 2 had already found a match a previous
                                    search
                                 */
                                if(searchPositions.contains(pixelPosition)){
                                    continue;
                                    // match was found continue with the search
                                }else{
                                    // duplicate entry not found
                                    pixelMatch.add(pixel);
                                }

                            }
                        }
                    }

                }
            }

            /* we use the pixel counter and the size of the pixelMatch to check if all
                pixel had matches in search
             */
            if(counter==pixelMatch.size()){
                return true;
            }else {
                return false;
            }
        }else {
            System.out.println("false");
            return false;
        }
    }

    public static void main(String[] args){
        String[][] img ={
                {"you","me"},
                {"us","we"}
        };
        String[][] img2 ={
                {"you","me"},
                {"us","we"}
        };

        isImageRandomlyScattered(img,img2);
    }
}
