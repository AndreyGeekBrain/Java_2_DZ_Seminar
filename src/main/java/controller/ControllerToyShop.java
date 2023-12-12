package controller;

import model.ModelToyShop;

public class ControllerToyShop {

    private ModelToyShop modelToyShop;

    public ControllerToyShop () {
        this.modelToyShop = new ModelToyShop ();
    }

    public void toyDraw(){
        modelToyShop.toyDrawModel ();
    }

    public void drawingWinnersTableToys(){
        modelToyShop.prizeListToysLottery ();
    }

    public void winnerTakesToy(String nameWinner,int id){
        modelToyShop.winnerTakesToyModel(nameWinner, id);
    }

    public void newListOfParticipatingToys(){
        modelToyShop.newListOfParticipatingToys ();
    }

    public void addNewToyToStore(String nameToy,int priorityToy){
        modelToyShop.addNewToyToStoreModel(nameToy,priorityToy);
    }

    public void delToyToStore(int id){
            modelToyShop.delToyToStore(id);
    }

    public void changePriorityOfToy(){

    }

    public void exitProgrammes(){

    }








}
