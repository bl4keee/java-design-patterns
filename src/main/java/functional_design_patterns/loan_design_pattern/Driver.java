package functional_design_patterns.loan_design_pattern;

/**
 * @author bl4kee
 * @since 17.04.2023
 */
public class Driver {

  public static void main(String[] args) {

    FileToProcess.processFile(theFile -> theFile
        .processMetaData()
        .analyzeHeader()
        .checkSpelling()
        .checkGrammar());
  }
}
