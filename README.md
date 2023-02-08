# HangHae99


## API

|기능|Method|URL|Request|
|------|---|---|---|
|게시글 추가|POST|/api/posts|{"username" : "이름", "password" : "비번", "title" : "제목", "contents":"내용"}|
|전체 게시글 조회|GET|/api/posts|-|
|선택 게시글 조회|GET|/api/posts/{id}|{"password" : "비번"}|
|선택 게시글 수정|PUT|/api/posts/{id}|{"username" : "이름", "password" : "비번", "title" : "제목", "contents":"내용"}|
|선택 게시글 삭제|DELETE|/api/posts/{id}|{"password" : "비번"}|
