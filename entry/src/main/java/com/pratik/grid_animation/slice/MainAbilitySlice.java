package com.pratik.grid_animation.slice;

import com.pratik.grid_animation.ResourceTable;
import com.pratik.grid_animation_library.animationGrid;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.utils.Color;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        animationGrid Button1 = (animationGrid) findComponentById(ResourceTable.Id_button_1);
        Button1.setText("Button");
        Button1.setIconRes("https://www.animatedimages.org/data/media/209/animated-cat-image-0072.gif");
        Button1.setBg(ResourceTable.Graphic_button_gray);
        Button1.setTextColor(Color.WHITE);


        animationGrid Button2 = (animationGrid) findComponentById(ResourceTable.Id_button_2);
        Button2.setIconRes("https://www.animatedimages.org/data/media/209/animated-cat-image-0407.gif");
        Button2.setBg(ResourceTable.Graphic_button_red);

        animationGrid Button3 = (animationGrid) findComponentById(ResourceTable.Id_button_3);
        Button3.setIconRes("https://www.animatedimages.org/data/media/202/animated-dog-image-0022.gif");
        Button3.setBg(ResourceTable.Graphic_button_blue);

        animationGrid Button4 = (animationGrid) findComponentById(ResourceTable.Id_button_4);
        Button4.setIconRes("https://www.animatedimages.org/data/media/202/animated-dog-image-0026.gif");
        Button4.setBg(ResourceTable.Graphic_button_white);
        Button1.setTextColor(Color.BLACK);










    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
