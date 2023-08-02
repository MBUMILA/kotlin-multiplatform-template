package me.inassar.feature.data.remote

import me.inassar.common.network.ResponseResource
import me.inassar.feature.data.remote.dto.getProducts.response.GetProductsResponseDto

/**
 * Created by Ahmed Nassar on 5/27/23.
 */
interface FeatureRemoteApi {
    suspend fun getProductsList(): ResponseResource<GetProductsResponseDto>
}