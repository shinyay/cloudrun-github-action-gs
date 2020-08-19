# Name

Overview

## Description

### Create a Service Account
This step will create a Service Account which anthenticate GitHub Action calls to GCP project.
```
$ gcloud iam service-accounts create github-action-deploy \
    --description="For GitHub Action" \
    --display-name="github-action-deploy"
```

### Bind Roles
This step will grant the minimum permission nesessary.

- Cloud Run Admin
  - `roles/run.admin`

```
$ gcloud projects add-iam-policy-binding (gcloud config get-value project) --member serviceAccount:github-action-deploy --role roles/run.admin
```
## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
