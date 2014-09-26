package kr.ac.mju.snapmovie.util;

import java.io.File;

/**
 * Created by 김경만 on 2014-09-26.
 */
public abstract class AlbumFactory {
    public abstract File getAlbumStorageDir(String albumName);
}
