package psc.schoolt.mvp.presenter;

import psc.schoolt.mvp.view.MainView;
import psc.schoolt.mvp.model.Board;
import psc.schoolt.mvp.model.Player;

public class MainPresenter implements Presenter {

    private MainView view;
    private Board model;

    public MainPresenter(MainView view) {
        this.view = view;
        this.model = new Board();
    }


    @Override
    public void onCreate() {
        model = new Board();
    }

    @Override
    public void onPause() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void onButtonSelected(int row, int col) {
        Player playerThatMoved = model.mark(row, col);

        if(playerThatMoved != null) {
            view.setButtonText(row, col, playerThatMoved.toString());

            if (model.getWinner() != null) {
                view.showWinner(playerThatMoved.toString());
            }
        }
    }

    public void onResetSelected() {
        view.clearWinnerDisplay();
        view.clearButtons();
        model.restart();
    }

}
