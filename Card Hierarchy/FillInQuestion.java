public class FillInQuestion
{
    private String text;
    //sample question: "the inventor of java was _james gosling_"
    //parse the specified question into a questoin to display and
    // an answer to check:
    // question: "The inventor of java was ____"
    // answer: "james Gosling"
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question +="_____" +parser.next();
        super.setText(question);
        super.setAnswer(question);
    }
}