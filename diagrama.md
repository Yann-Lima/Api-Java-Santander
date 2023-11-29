# Diagrama de Classes do Usuário

```mermaid
classDiagram
  class User {
    - String name
    - Account account
    - List<Feature> features
    - Card card
    - List<News> news
  }

  class Account {
    - String number
    - String agency
    - BigDecimal balance
    - BigDecimal limit
  }

  class Feature {
    - String icon
    - String description
  }

  class Card {
    - String number
    - BigDecimal limit
  }

  class News {
    - String icon
    - String description
  }
