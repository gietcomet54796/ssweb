class SceneMain extends Phaser.Scene {
    constructor() {
        super('SceneMain');
    }
    preload()
    {

    }
    create() {
       //define our objects
       emitter=new Phaser.Events.EventEmitter();
       controller=new Controller();
    //   this.mediaManager=new MediaManager({scene:this});
       model.gameOver=false;

       this.sb=new ScoreBox({scene:this});  // this only counts the number of objects that pass bottom line
       this.sb.x=game.config.width-50;
       this.sb.y=80;
       model.score=0; // set starting score
       this.road=new Road({scene:this});
       this.road.x=game.config.width/2;
       this.road.makeLines();  //use road instead of this
       //this.alignGrid=new AlignGrid({scene:this,rows:5,cols:5});
       // this.alignGrid.showNumbers();
  //     var soundButtons=new SoundButtons({scene:this});
       console.log("Ready!");
    }
    update() {
        //constant running loop
        this.road.moveLines();
        this.road.moveObject();
    }

}
