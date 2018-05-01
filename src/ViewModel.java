public class ViewModel {

    private AndroidInterface androidInterface;

    public ViewModel(AndroidInterface androidInterface) {
        this.androidInterface = androidInterface;
    }

    public void insert(String data) {
        //insert data ke server & lokal

        androidInterface.onInsertFinish(true);
    }
}
