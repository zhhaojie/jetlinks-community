package org.jetlinks.community.timeseries;

import reactor.core.publisher.Mono;

/**
 * 时序数据服务管理器,统一管理时序数据操作接口
 *
 * @author zhouhao
 * @since 1.0
 */
public interface TimeSeriesManager {

    /**
     * 根据指标获取服务
     *
     * @param metric 指标,通常是
     * @return 时序服务
     */
    TimeSeriesService getService(TimeSeriesMetric metric);

    /**
     * 注册元数据
     *
     * @param metadata 元数据
     * @return 注册结果
     */
    Mono<Void> registerMetadata(TimeSeriesMetadata metadata);
}
