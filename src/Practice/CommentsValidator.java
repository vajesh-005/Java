package Practice;


import java.util.Locale;

//class InvalidCommentException extends Exception{
//    public InvalidCommentException(String message){
//        super(message);
//    }
//}


public class CommentsValidator {
    public static void validateComment(String comment){
        String[] validateArrWords = {"illegal" , "sexual harassment"};
        if(comment.length()>50){
            throw new IllegalArgumentException("Comment should contains below 50 characters....");
        }
        for(String word : validateArrWords){
            if(comment.toLowerCase().contains(word.toLowerCase())){
                throw new IllegalArgumentException("You are not allowed to use unnecessary words");
            }
        }
    }

    public static void main(String[] args) {
        String comment = "Hey this contains some illegal content";

        try {
            validateComment(comment);
            System.out.println("Comment is valid");
        } catch (IllegalArgumentException msg){
            System.out.println("Error:" + msg.getMessage());
            msg.printStackTrace();
        }
    }
}
