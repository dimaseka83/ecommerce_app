package com.android.praktikum.ecommerce.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.praktikum.ecommerce.Interface.ItemClickListner;
import com.android.praktikum.ecommerce.R;

import org.w3c.dom.Text;

public class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{
    public TextView txtproductName, txtProductDescription, txtProductPrice, txtProductStatus;
    public ImageView imageView;
    public ItemClickListner listner;

    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = (ImageView) itemView.findViewById(R.id.product_seller_image);
        txtproductName = (TextView) itemView.findViewById(R.id.seller_product_name);
        txtProductDescription = (TextView) itemView.findViewById(R.id.product_seller_description);
        txtProductPrice = (TextView) itemView.findViewById(R.id.product_seller_price);
        txtProductStatus = (TextView) itemView.findViewById(R.id.seller_product_state);

    }

    public void setItemClickListener(ItemClickListner listner)
    {
        this.listner = listner;
    }

    @Override
    public void onClick(View view) {
        listner.onClick(view, getAdapterPosition(), false);
    }
}