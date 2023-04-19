package functional_design_patterns.loan_design_pattern;

import java.io.File;
import java.util.function.Consumer;

/**
 * @author bl4kee
 * @since 17.04.2023
 */
public class FileToProcess {

  protected FileToProcess() {
    openFile();
  }

  public static void processFile(final Consumer<FileToProcess> block) {
    final FileToProcess theFile = new FileToProcess();
    block.accept(theFile);
    theFile.closeFile();
  }

  public FileToProcess openFile() {
    System.out.println("\nFile opened for processing by constructor");
    return this;
  }

  public FileToProcess processMetaData() {
    System.out.println("\tProcessing metadata...");
    return this;
  }

  public FileToProcess analyzeHeader() {
    System.out.println("\tAnalyzing header...");
    return this;
  }

  public FileToProcess checkSpelling() {
    System.out.println("\tChecking spelling...");
    return this;
  }

  public FileToProcess checkGrammar() {
    System.out.println("\tChecking grammar...");
    return this;
  }

  public void closeFile() {
    System.out.println("File closed");
  }
}
