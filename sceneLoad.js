class SceneLoad extends Phaser.Scene {
    constructor() {
        super('SceneLoad');
    }

    preload(){

      //loader
      this.bar=new Bar({scene:this,x:game.config.width/2,y:game.config.height/2});
      this.progText=this.add.text(game.config.width/2,game.config.height/2,"0%",{color:"#ffffff", fontSize:game.config.width/20});
      this.progText.setOrigin(0.5,0.5);
      this.load.on("progress",this.onProgress,this);
      //progress bar

      //load our images or sounds
      this.load.image("road","dodgechallenge/images/road.jpg");
      this.load.spritesheet("cars","dodgechallenge/images/cars.png",{frameWidth:60,frameHeight:126});
      this.load.image("titleBack","dodgechallenge/images/titleBack.jpg");
      this.load.image("line","dodgechallenge/images/line.png");
      this.load.image("pcar1","dodgechallenge/images/pcar1.png");
      this.load.image("pcar2","dodgechallenge/images/pcar2.png");
      this.load.image("cone","dodgechallenge/images/cone.png");
      this.load.image("barrier","dodgechallenge/images/barrier.png");
      this.load.image("button1","dodgechallenge/images/ui/buttons/2/1.png");
      this.load.image("title", "dodgechallenge/images/title.png");

      this.load.image("toggleBack","images/ui/toggles/1.png");
      this.load.image("sfxOff","dodgechallenge/images/ui/icons/sfx_off.png");
      this.load.image("sfxOn","dodgechallenge/images/ui/icons/sfx_on.png");
      this.load.image("musicOn","dodgechallenge/images/ui/icons/music_on.png");
      this.load.image("musicOff","dodgechallenge/images/ui/icons/music_off.png");

      this.load.audio("backgroundMusic",["dodgechallenge/audio/random-race.mp3","dodgechallenge/audio/random-race.ogg"]);
      this.load.audio("boom",["dodgechallenge/audio/boom.mp3","dodgechallenge/audio/boom.ogg"]);
      this.load.audio("whoosh",["dodgechallenge/audio/whoosh.mp3","dodgechallenge/audio/whoosh.ogg"]);
    }

    onProgress(value)
    {
      console.log(value);
      var per=Math.floor(value*100);
      this.progText.setText(per+"%");
      this.bar.setPercent(value);
    }
    create(){
      this.scene.start("SceneTitle");
    }
}
