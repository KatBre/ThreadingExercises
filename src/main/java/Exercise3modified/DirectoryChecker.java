package Exercise3modified;

public class DirectoryChecker implements Runnable{
    private String directory;
    private ICheckOperation checkOperation;

    public DirectoryChecker(String directory, ICheckOperation checkOperation) {
        this.directory = directory;
        this.checkOperation = checkOperation;
    }

    @Override
    public void run() {
        checkOperation.check(directory);
    }
}
