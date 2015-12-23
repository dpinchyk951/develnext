package org.develnext.jphp.ext.game;

import org.develnext.jphp.ext.game.classes.*;
import org.develnext.jphp.ext.game.support.*;
import org.develnext.jphp.ext.javafx.JavaFXExtension;
import php.runtime.env.CompileScope;

public class GameExtension extends JavaFXExtension {
    public static final String NS = "php\\game";

    @Override
    public Status getStatus() {
        return Status.EXPERIMENTAL;
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerWrapperClass(scope, Sprite.class, UXSprite.class);
        registerWrapperClass(scope, SpriteView.class, UXSpriteView.class);
        registerWrapperClass(scope, GameObject.class, UXGameObject.class);
        registerWrapperClass(scope, GameScene.class, UXGameScene.class);
        registerWrapperClass(scope, GamePane.class, UXGamePane.class);

        registerEventProvider(new GameObjectEventProvider());
    }
}