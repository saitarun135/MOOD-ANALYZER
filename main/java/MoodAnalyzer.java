public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyzerException {
        this.message = message;
        return analyseMood();
    }

    public String analyseMood() throws MoodAnalyzerException {
        try {
            if (message.length() == 0)
                throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.ENTERED_EMPTY, "Please enter Proper Mood");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalyzerException(MoodAnalyzerException.exceptionType.ENTERED_NULL, "Please enter Proper Mood");
        }
    }
}