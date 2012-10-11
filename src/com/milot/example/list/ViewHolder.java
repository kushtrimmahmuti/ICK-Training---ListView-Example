package com.milot.example.list;

import android.view.View;
import android.widget.TextView;

public class ViewHolder {
	View base;
	TextView name;
	TextView description;
	
	public ViewHolder(View base) {
		this.base = base;
	}
	
	public TextView getName()
	{
		if (name == null)
			name = (TextView) base.findViewById(R.id.name);
		
		return name;
	}
	
	public TextView getDescription() {
		if (description == null) 
			description = (TextView) base.findViewById(R.id.description);
		
		return description;
	}
}
