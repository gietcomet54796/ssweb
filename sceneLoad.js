class SceneLoad extends Phaser.Scene {
    constructor() {
        super('SceneLoad');
    }
    preload() {
        this.bar = new Bar({
            scene: this,
            x: game.config.width / 2,
            y: game.config.height / 2
        });
        this.progText = this.add.text(game.config.width / 2, game.config.height / 2, "0%", {
            color: '#ffffff',
            fontSize: game.config.width / 20
        });
        this.progText.setOrigin(0.5, 0.5);
        this.load.on('progress', this.onProgress, this);
        this.load.image("button1", "neutralzone/images/ui/buttons/2/1.png");
        this.load.image("button2", "neutralzone/images/ui/buttons/2/5.png");
        //
        //
        this.load.audio('explode', ["neutralzone/audio/explode.wav", "neutralzone/audio/explode.ogg"]);
        this.load.audio('enemyShoot', ["neutralzone/audio/enemyShoot.wav", "neutralzone/audio/enemyShoot.ogg"]);
        this.load.audio('laser', ["neutralzone/audio/laser.wav", "neutralzone/audio/laser.ogg"]);
        this.load.audio('backgroundMusic', ["neutralzone/audio/background.mp3", "neutralzone/audio/background.ogg"]);
        // 
        // 
        // 
        this.load.image("toggleBack", "neutralzone/images/ui/toggles/1.png");
        this.load.image("sfxOff", "neutralzone/images/ui/icons/sfx_off.png");
        this.load.image("sfxOn", "neutralzone/images/ui/icons/sfx_on.png");
        this.load.image("musicOn", "neutralzone/images/ui/icons/music_on.png");
        this.load.image("musicOff", "neutralzone/images/ui/icons/music_off.png");
        this.load.image("ship", "neutralzone/images/player.png");
        this.load.image("background", "neutralzone/images/background.jpg");
        this.load.spritesheet('rocks', 'neutralzone/images/rocks.png', {
            frameWidth: 125,
            frameHeight: 100
        });
        this.load.spritesheet('exp', 'neutralzone/images/exp.png', {
            frameWidth: 64,
            frameHeight: 64
        });
        this.load.image("bullet", "neutralzone/images/bullet.png");
        this.load.image("ebullet", "neutralzone/images/ebullet.png");
        this.load.image("eship", "neutralzone/images/eship.png");
    }
    onProgress(value) {
        this.bar.setPercent(value);
        var per = Math.floor(value * 100);
        this.progText.setText(per + "%");
    }
    create() {
        var frameNames = this.anims.generateFrameNumbers('exp');
        var f2 = frameNames.slice();
        f2.reverse();
        var f3 = f2.concat(frameNames);
        this.anims.create({
            key: 'boom',
            frames: f3,
            frameRate: 48,
            repeat: false
        });
        this.scene.start("SceneTitle");
    }
}