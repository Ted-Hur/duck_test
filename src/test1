레가시 개발환경 구축
- 목적 : 기존 서비스를 유지하면서 신규 서비스를 개발하기 위함이고, 장기적으로 모두 신규 서비스 플랫폼으로 넘어가기 위함.
- 배경 : 현재 개발팀 기능 stop 상태라서 개발 환경이 없었음.
- 진행 계획
```mermaid
   flowchart LR
      subgraph Plan
         direction TB
         step1[소스 테스트/운영 분리 - 도커 로컬빌드]:::domainEvent
         step2[소스 테스트/운영 분리 - EC2에서 도커 빌드]:::domainEvent
         step3[소스 테스트/운영 분리 - 통합테스트]:::domainEvent
         step4[데이터 테스트/운영 분리 - DB EC2 생성 및 초기데이터 적재]:::domainEvent
         step5[데이터 테스트/운영 분리 - 통합테스트]:::domainEvent
         step6[레가시 데이터 클랜징]:::domainEvent
         step7[레가시 데이터 클랜징-통합테스트]:::domainEvent
         step8[레가시 데이터 클랜징-소스리펙토링]:::domainEvent
         step9[레가시 데이터 클랜징-통합테스트]:::domainEvent

         step1 --> step2
         step2 --> |PHP/node/python 프로퍼티 분리 개발| step3
         step3 --> step4
         step4 --> step5
         step5 --> step6
         step6 --> |미사용 데이터를 식별하는 것이 목적| step7
         step7 --> |API response 수정| step8
         step8 --> step9
      end
      class Plan plan
      classDef plan fill:white,color:black
      classDef domainEvent fill:orange,color:white
```
