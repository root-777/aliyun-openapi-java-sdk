/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetScreenAccessRequest extends RpcAcsRequest<GetScreenAccessResponse> {
	   

	private Long expireTime;

	private String product;

	private String params;

	private String version;

	private Integer screenId;

	private String memberUId;

	private String domain;
	public GetScreenAccessRequest() {
		super("datav-outer", "2019-04-02", "GetScreenAccess", "datav");
		setMethod(MethodType.POST);
	}

	public Long getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putBodyParameter("ExpireTime", expireTime.toString());
		}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putBodyParameter("Product", product);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putBodyParameter("Params", params);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	public Integer getScreenId() {
		return this.screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
		if(screenId != null){
			putBodyParameter("ScreenId", screenId.toString());
		}
	}

	public String getMemberUId() {
		return this.memberUId;
	}

	public void setMemberUId(String memberUId) {
		this.memberUId = memberUId;
		if(memberUId != null){
			putBodyParameter("MemberUId", memberUId);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
		}
	}

	@Override
	public Class<GetScreenAccessResponse> getResponseClass() {
		return GetScreenAccessResponse.class;
	}

}
