graph TD
    subgraph Development
        A[Dev: Commit Code]
    end

    subgraph Continuous Integration (CI)
        B[Dependency Check] --> C[Run Tests]
        C --> D[SonarQube Scan]
    end

    subgraph Build & Packaging
        D --> E[Package Jar]
        E --> F[Build Docker Image]
    end

    subgraph Security & Publishing
        F --> G[Anchore: Scan Image]
        G --> H{Vulnerabilities Found?}
        H -- No --> I[Push Docker Image]
        H -- Yes --> J[Notify Security/Fail Build]
    end

    % Connect the stages
    A --> B