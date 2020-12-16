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
        this.load.image("title", "colorpong/images/title.png");
        this.load.image("button1", "colorpong/images/ui/buttons/2/1.png");
        this.load.image("button2", "colorpong/images/ui/buttons/2/5.png");
        // this.load.audio('cat',["audio/meow.mp3","audio/meow.ogg"]);
        // this.load.audio('backgroundMusic',["audio/background.mp3","audio/background.ogg"]);
        this.load.image("toggleBack", "colorpong/images/ui/toggles/3.png");
        this.load.image("sfxOff", "colorpong/images/ui/icons/sfx_off.png");
        this.load.image("sfxOn", "colorpong/images/ui/icons/sfx_on.png");
        this.load.image("musicOn", "colorpong/images/ui/icons/music_on.png");
        this.load.image("musicOff", "colorpong/images/ui/icons/music_off.png");
        this.load.spritesheet('balls', 'colorpong/images/balls.png', {
            frameWidth: 100,
            frameHeight: 100
        });
        this.load.spritesheet('paddles', 'colorpong/images/paddles.png', {
            frameWidth: 400,
            frameHeight: 50
        });
        this.load.image('bar', 'colorpong/images/bar.jpg');
        this.load.audio('lose', ['colorpong/audio/lose.wav', 'colorpong/audio/lose.ogg']);
        this.load.audio('flip', ['colorpong/audio/flip.wav', 'colorpong/audio/flip.ogg']);
        this.load.audio('hit', ['colorpong/audio/hit.wav', 'colorpong/audio/hit.ogg']);
    }
    onProgress(value) {
        this.bar.setPercent(value);
        var per = Math.floor(value * 100);
        this.progText.setText(per + "%");
    }
    create() {
        this.scene.start("SceneTitle");
    }
}