package com.zonarmr.floatingactionbutton;

import android.app.*;
import android.os.*;
import android.support.v7.app.*;
import com.github.clans.fab.*;
import android.view.*;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		FloatingActionMenu materialDesignFAM;
		FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3;
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item3);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					//accion del primer boton

				}
			});
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					//accion del segundo boton

				}
			});
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					//accion del tercer boton

				}
			});
    }
}
