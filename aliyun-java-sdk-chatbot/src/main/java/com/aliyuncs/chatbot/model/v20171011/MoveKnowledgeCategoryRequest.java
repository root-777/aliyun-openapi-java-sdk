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

package com.aliyuncs.chatbot.model.v20171011;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class MoveKnowledgeCategoryRequest extends RpcAcsRequest<MoveKnowledgeCategoryResponse> {
	
	public MoveKnowledgeCategoryRequest() {
		super("Chatbot", "2017-10-11", "MoveKnowledgeCategory", "beebot");
	}

	private Long knowledgeId;

	private Long categoryId;

	public Long getKnowledgeId() {
		return this.knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
		if(knowledgeId != null){
			putQueryParameter("KnowledgeId", knowledgeId.toString());
		}
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId.toString());
		}
	}

	@Override
	public Class<MoveKnowledgeCategoryResponse> getResponseClass() {
		return MoveKnowledgeCategoryResponse.class;
	}

}
