import java.util.*;

public class AndroidMain implements AndroidInterface {

    public static void main(String[] args) {

    }

    void onCreate(){
        ViewModel viewModel = new ViewModel(this);
        viewModel.insert("data 1");
    }

    @Override
    public void onInsertFinish(boolean status) {

    }
}
