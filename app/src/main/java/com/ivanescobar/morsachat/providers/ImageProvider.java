package com.ivanescobar.morsachat.providers;

import android.content.Context;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.ivanescobar.morsachat.utils.CompressorBitmapImage;

import java.io.File;
import java.util.Date;

public class ImageProvider {

    StorageReference mStorage;

    public ImageProvider(){ mStorage = FirebaseStorage.getInstance().getReference(); }

    public UploadTask save(Context context, File file){
        byte[] imageByte = CompressorBitmapImage.getImage(context, file.getPath(), 500, 500);
        StorageReference storage = mStorage = FirebaseStorage.getInstance().getReference().child(new Date() + ".jpg");
        mStorage = storage;
        UploadTask task = storage.putBytes(imageByte);
        return task;
    }

    public StorageReference getStorage(){
        return mStorage;
    }
}
