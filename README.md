# HangHae99


## API

|기능|Method|URL|Request|
|------|---|---|---|
|게시글 추가|POST|/api/posts|{
"title" : "title",
"content" : "content",
"author" : "author",
"password" : "password"
}|
|전체 게시글 조회|GET|/api/posts|-|
|선택 게시글 조회|GET|/api/posts/{id}|
|선택 게시글 수정|PUT|/api/posts/{id}|
|선택 게시글 삭제|DELETE|/api/posts/{id}|
