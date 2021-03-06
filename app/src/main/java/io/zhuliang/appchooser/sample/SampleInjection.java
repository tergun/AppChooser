package io.zhuliang.appchooser.sample;


import io.zhuliang.appchooser.sample.data.FileInfosRepository;
import io.zhuliang.appchooser.Injection;

/**
 * @author Zhu Liang
 * @version 1.0
 * @since 2017/5/13 下午3:53
 */

public class SampleInjection extends Injection {
    public static FileInfosRepository provideFileInfoRepository() {
        return new FileInfosRepository(provideSchedulerProvider());
    }
}
