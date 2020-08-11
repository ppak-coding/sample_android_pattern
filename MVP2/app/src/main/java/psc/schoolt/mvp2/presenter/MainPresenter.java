package psc.schoolt.mvp2.presenter;

import psc.schoolt.mvp2.MainConstants;
import psc.schoolt.mvp2.model.Board;
import psc.schoolt.mvp2.model.Player;

public class MainPresenter implements MainConstants.Presenter {

    private MainConstants.View view;
    private Board model;

    public MainPresenter(MainConstants.View view) {
        this.view = view;
        this.model = new Board();
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


    @Override
    public void onCreate() {

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
}
