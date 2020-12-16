class SceneTitle extends Phaser.Scene {
    constructor() {
        super('SceneTitle');
    }
    preload()
    {

    }
    create() {
        emitter=new Phaser.Events.EventEmitter();
        controller=new Controller();
        this.load.image("titleBack","images/titleBack.jpg");
        this.alignGrid=new AlignGrid({rows:11,cols:11,scene:this});
        this.backImage=this.add.image(game.config.width/2,game.config.height/2,"titleBack");
        //this.alignGrid.showNumbers();
        var title=this.add.image(0,0,"title");
        Align.scaleToGameW(title,.8);
        this.alignGrid.placeAtIndex(38,title);
        var btnStart=new FlatButton({scene:this,key:"button1",text:"start",event:"start_game"});
        this.alignGrid.placeAtIndex(93,btnStart);
        emitter.on("start_game",this.startGame,this);
  //      this.mediaManager=new MediaManager({scene:this});
  //      this.mediaManager.setBackgroundMusic("backgroundMusic");
    }

    startGame()
    {
        this.scene.start("SceneMain");
    }

    update() {}
}
