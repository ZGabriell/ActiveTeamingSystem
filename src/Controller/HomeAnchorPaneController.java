package Controller;

import Model.ActiveTeamingSystem;
import com.jfoenix.controls.JFXListView;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class HomeAnchorPaneController {
    // main Controller
    private MainAnchorPaneController mainAnchorPaneController;
    // ActiveTeamingSystem Model
    private ActiveTeamingSystem systemModel;

    //Buttons
    //@FXML private JFXButton ;
    //@FXML private JFXButton ;
    //FXML private JFXButton ;

    // list views
    @FXML private JFXListView listViewProfiles;

    @FXML private AnchorPane homeAnchorPane;

    // gets mainController and mainModel
    public void injectMainControllerAndMainModel(MainAnchorPaneController mainAnchorPaneController, ActiveTeamingSystem mainModel) {
        this.mainAnchorPaneController = mainAnchorPaneController;
        this.systemModel = mainModel;

        // also, initialize required fields
        populateProfileListsView();
    }


    public AnchorPane getHomeContent(){
        return homeAnchorPane;
        //homeAnchorPane.toFront();
    }

    public void populateProfileListsView(){
        systemModel.addProfilesToList();
        listViewProfiles.getItems().addAll(systemModel.getProfiles());
    }

}